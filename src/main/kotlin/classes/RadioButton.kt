package classes

class RadioButton : Button {
    private constructor(name: String, visible: Boolean)
       : super(name, visible)
    constructor(name: String)
       : this(name = name, visible = false)
}