import androidx.compose.ui.window.ComposeUIViewController
import com.gpixelprog.roadmapcmp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
