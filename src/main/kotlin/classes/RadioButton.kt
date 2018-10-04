package classes

class RadioButton : Button, Focusable {
    private constructor(name: String, visible: Boolean)
       : super(name, visible)
    constructor(name: String)
       : this(name = name, visible = false)
    override val hasFocus: Boolean
            get() = true
}