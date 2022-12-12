package com.example.coil_app.row_cards

import android.annotation.SuppressLint
import android.util.Log
import android.view.Gravity
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.ImagePainter.State.Empty.painter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import com.example.coil_app.ui_theme.cardCollapsedBackgroundColor
import com.example.coil_app.ui_theme.cardExpandedBackgroundColor
import com.example.coil_app.R
import com.example.coil_app.ui_theme.cardCollapsedBackgroundColor
import com.example.coil_app.ui_theme.cardExpandedBackgroundColor
import kotlinx.coroutines.ExperimentalCoroutinesApi


@ExperimentalFoundationApi
@ExperimentalCoroutinesApi
@Composable
fun RowsScreen(viewModel: ViewModelCards) {
    val personcards = viewModel.personCards.collectAsState()
    val expandedCardIds = viewModel.expandedPersonCardIdsList.collectAsState()

    val sections = listOf("Superheroes", "Looney Tunes", "Popular Shows", "Human" )
    val grouped = personcards.value.groupBy{it.section}

    Scaffold(
        backgroundColor = Color(
            ContextCompat.getColor(
                LocalContext.current,
                R.color.teal_200 // The main screen color
            )
        )
    ) {
        LazyColumn {
            sections.forEach { section ->
                stickyHeader {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth().padding(10.dp)
                                // Magenta is the color of the sections
                            .background(Color.Magenta,shape = CircleShape)
                            .padding(5.dp), // Size of padding sections
                        fontSize = 25.sp, // Font size of the sections text
                        text = " $section",
                        textAlign = TextAlign.Center,
                        color = Color.Blue // Fill in the color of the sections text
                    )
                }
                itemsIndexed(personcards.value) { _, personcard ->
                    if (personcard.section==section){
                        ExpandablepersonCard(
                            card = personcard,
                            onCardArrowClick = { viewModel.onPersonCardArrowClicked(personcard.id) },
                            expanded = expandedCardIds.value.contains(personcard.id),
                        )
                    }
                }
            }
        }
    }
}

@SuppressLint("UnusedTransitionTargetStateParameter")
@Composable
fun ExpandablepersonCard(
    card: Person,
    onCardArrowClick: () -> Unit,
    expanded: Boolean,
) {
    val transitionState = remember {
        MutableTransitionState(expanded).apply {
            targetState = !expanded
        }
    }
    val transition = updateTransition(transitionState, label = "transition")
    val cardBgColor by transition.animateColor({
        tween(durationMillis = EXPAND_ANIMATION_DURATION)
    },
        label = "bgColorTransition") {
        if (expanded) cardExpandedBackgroundColor else cardCollapsedBackgroundColor
    }
    val cardPaddingHorizontal by transition.animateDp({
        tween(durationMillis = EXPAND_ANIMATION_DURATION)
    },
        label = "paddingTransition") {
        if (expanded) 28.dp else 24.dp
    }
    val cardElevation by transition.animateDp({
        tween(durationMillis = EXPAND_ANIMATION_DURATION)
    },
        label = "elevationTransition") {
        if (expanded) 24.dp else 4.dp
    }
    val cardRoundedCorners by transition.animateDp({
        tween(
            durationMillis = EXPAND_ANIMATION_DURATION,
            delayMillis = 10000,
            easing = FastOutSlowInEasing
        )
    },
        label = "cornersTransition") {
        if (expanded) 0.dp else 16.dp
    }
    val arrowRotationDegree by transition.animateFloat({
        tween(durationMillis = EXPAND_ANIMATION_DURATION)
    },
        label = "rotationDegreeTransition") {
        if (expanded) 0f else 180f
    }

    Card(
        backgroundColor = cardBgColor,
        contentColor = Color(
            ContextCompat.getColor(
                LocalContext.current,
                R.color.black
            )
        ),
        elevation = cardElevation,
        shape = RoundedCornerShape(cardRoundedCorners),
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = cardPaddingHorizontal,
                vertical = 8.dp
            )
    ) {
        Column {
            Box {
                PersonCardArrow(
                    degrees = arrowRotationDegree,
                    onClick = onCardArrowClick
                )
                PersonCardTitle(title = card.title,Image=card.Image)
            }
            ExpandablePersonContent(visible = expanded,body = card.body,Image=card.Image)
        }
    }
}

@Composable
fun PersonCardArrow(
    degrees: Float,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        content = {
            Icon(
                painter = painterResource(id = R.drawable.ic_extension),
                contentDescription = "Expandable Arrow",
                modifier = Modifier.rotate(degrees),
            )
        }
    )
}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun PersonCardTitle(title: String,Image: String) {
    Row(modifier = Modifier.padding(8.dp)){
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp).weight(8f),
            textAlign = TextAlign.Center,
        )
        val painter1 = rememberImagePainter(data = Image,
            builder = {
                error(R.drawable.ic_error)
                transformations(
                    CircleCropTransformation()
                )
            },
        )

        Image(
            painter = painter1,
            contentDescription = null,
            modifier = Modifier.width(50.dp).height(50.dp).weight(2f),
            alignment = Alignment.CenterEnd,
        )
        val printerState1 = painter1.state
        if(printerState1 is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }
        Spacer(modifier = Modifier.heightIn(10.dp))
    }
}

@OptIn(ExperimentalAnimationApi::class, coil.annotation.ExperimentalCoilApi::class)
@Composable
fun ExpandablePersonContent(
    visible: Boolean = true,
    body: String,
    Image:String,
) {
    val enterFadeIn = remember {
        fadeIn(
            animationSpec = TweenSpec(
                durationMillis = FADE_IN_ANIMATION_DURATION,
                easing = FastOutLinearInEasing
            )
        )
    }
    val enterExpand = remember {
        expandVertically(animationSpec = tween(EXPAND_ANIMATION_DURATION))
    }
    val exitFadeOut = remember {
        fadeOut(
            animationSpec = TweenSpec(
                durationMillis = FADE_OUT_ANIMATION_DURATION,
                easing = LinearOutSlowInEasing
            )
        )
    }
    val exitCollapse = remember {
        shrinkVertically(animationSpec = tween(COLLAPSE_ANIMATION_DURATION))
    }
    AnimatedVisibility(
        visible = visible,
        enter = enterExpand + enterFadeIn,
        exit = exitCollapse + exitFadeOut
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            val painter1 = rememberImagePainter(data = Image,
                builder = {
                    error(R.drawable.ic_error)

                    transformations(
                        //GrayscaleTransformation(),
                        CircleCropTransformation(),
                        //BlurTransformation(LocalContext.current)
                    )
                })
            Image(
                painter = painter1,
                contentDescription = null,
                modifier = Modifier.width(350.dp).height(200.dp),
                alignment = Alignment.Center
                )
            val printerState1 = painter1.state
            if(printerState1 is ImagePainter.State.Loading){
                CircularProgressIndicator()
            }
            Spacer(modifier = Modifier.heightIn(10.dp))

            Text(
                text = body,
                textAlign = TextAlign.Start
            )
        }
    }
}


