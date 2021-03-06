package conventions.delegation

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

open class PropertyChangeAware {
    protected val propertyChangeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener: PropertyChangeListener)
            = propertyChangeSupport.addPropertyChangeListener(listener)

    fun removePropertyChangeListener(listener: PropertyChangeListener): Unit {
        propertyChangeSupport.removePropertyChangeListener(listener)
    }
}