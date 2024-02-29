package top.chengdongqing.weui.ui.screens.feedback

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import top.chengdongqing.weui.ui.components.button.ButtonType
import top.chengdongqing.weui.ui.components.button.WeButton
import top.chengdongqing.weui.ui.components.screen.WeScreen
import top.chengdongqing.weui.ui.components.toast.ToastIcon
import top.chengdongqing.weui.ui.components.toast.ToastOptions
import top.chengdongqing.weui.ui.components.toast.rememberWeToast
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun ToastScreen() {
    val toast = rememberWeToast()
    val coroutineScope = rememberCoroutineScope()

    WeScreen(
        title = "Toast",
        description = "弹出式提示",
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        WeButton(text = "成功提示", type = ButtonType.PLAIN) {
            toast.show(ToastOptions(title = "已完成", icon = ToastIcon.SUCCESS))
        }
        WeButton(text = "失败提示", type = ButtonType.PLAIN) {
            toast.show(ToastOptions(title = "获取链接失败", icon = ToastIcon.FAIL))
        }
        WeButton(text = "长文案提示", type = ButtonType.PLAIN) {
            toast.show(ToastOptions(title = "此处为长文案提示详情", icon = ToastIcon.FAIL))
        }
        WeButton(text = "立即支付", type = ButtonType.PLAIN) {
            toast.show(
                ToastOptions(
                    title = "支付中...",
                    icon = ToastIcon.LOADING,
                    duration = Duration.INFINITE
                )
            )
            coroutineScope.launch {
                delay(2000.milliseconds)
                toast.show(ToastOptions(title = "支付成功", icon = ToastIcon.SUCCESS))
            }
        }
        WeButton(text = "文字提示", type = ButtonType.PLAIN) {
            toast.show(ToastOptions("文字提示"))
        }
    }
}