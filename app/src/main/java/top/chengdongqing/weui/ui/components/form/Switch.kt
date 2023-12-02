package top.chengdongqing.weui.ui.components.form

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import top.chengdongqing.weui.ui.theme.BorderColor
import top.chengdongqing.weui.ui.theme.PrimaryColor

@Composable
fun WeSwitch(
    checked: Boolean = false,
    disabled: Boolean = false,
    onChange: ((checked: Boolean) -> Unit)? = null
) {
    val offsetX by animateDpAsState(
        targetValue = if (checked) 26.dp else 2.dp,
        animationSpec = tween(durationMillis = 100),
        label = "SwitchAnimation"
    )

    Box(
        Modifier
            .size(50.dp, 26.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                if (checked) {
                    if (!disabled) {
                        PrimaryColor
                    } else {
                        Color(7, 193, 96, 50)
                    }
                } else {
                    BorderColor
                }
            )
            .clickable(
                interactionSource = remember {
                    MutableInteractionSource()
                },
                indication = null,
                enabled = !disabled
            ) {
                onChange?.invoke(!checked)
            }
    ) {
        Box(
            Modifier
                .offset(offsetX, 2.dp)
                .size(22.dp)
                .clip(RoundedCornerShape(50))
                .background(Color.White)
        )
    }
}