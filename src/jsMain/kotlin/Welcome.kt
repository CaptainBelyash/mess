import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import kotlinx.html.style
import org.w3c.dom.HTMLInputElement
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

external interface WelcomeProps : RProps {
    var name: String
}

data class WelcomeState(val name: String) : RState

@JsExport
class Welcome(props: WelcomeProps) : RComponent<WelcomeProps, WelcomeState>(props) {

    init {
        state = WelcomeState(props.name)
    }

    override fun RBuilder.render() {
        h1 {
            +"mess"
        }
        div {
            ul {
                li {
                    img {
                        attrs {
                            src = "https://sun1-57.userapi.com/s/v1/ig1/3oUoBxpwx6_BhXuRxDV2PaMaqfv5hlAbAGsMm37HYbDj9jSNbgZc9CruOL7PE_YA3dfPJrMO.jpg?size=100x100&quality=96&crop=59,59,472,472&ava=1"
                        }
                    }
                    span {
                        +"Илюха"
                    }
                }
                li {
                    img {
                        attrs {
                            src = "https://sun1-57.userapi.com/s/v1/ig1/3oUoBxpwx6_BhXuRxDV2PaMaqfv5hlAbAGsMm37HYbDj9jSNbgZc9CruOL7PE_YA3dfPJrMO.jpg?size=100x100&quality=96&crop=59,59,472,472&ava=1"
                        }
                    }
                    span {
                        +"Злобный клон"
                    }
                }
            }
            div {
                ul {
                    li {
                        +"Илюха пишет: привет, пойдуем гулять?)"
                    }
                    li {
                        +"Илюха пишет: ну давай, не ломайся"
                    }
                    li {
                        +"Вы пишите: чел ты кто"
                    }
                    li {
                        +"Илюха пишет: это я =)"
                    }
                }
                input {
                    attrs {
                        type = InputType.text
                        value = state.name
                        onChangeFunction = { event ->
                            setState(
                                WelcomeState(name = (event.target as HTMLInputElement).value)
                            )
                        }
                    }
                }
            }
        }
    }
}
