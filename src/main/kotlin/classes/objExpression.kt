package classes

import java.awt.Window
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener

import javax.swing.JFrame
fun objExpression() {
    val window = Window(JFrame())
    window.addMouseListener(object : MouseListener, MouseWheelListener {
        override fun mouseWheelMoved(e: MouseWheelEvent?) {
        }

        override fun mouseReleased(e: MouseEvent?) {
        }

        override fun mouseEntered(e: MouseEvent?) {
        }

        override fun mouseClicked(e: MouseEvent?) {
        }

        override fun mouseExited(e: MouseEvent?) {
        }

        override fun mousePressed(e: MouseEvent?) {
        }
    })

}


