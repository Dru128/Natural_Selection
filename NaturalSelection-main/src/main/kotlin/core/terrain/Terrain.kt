package core.terrain

import core.SimulationObject
import core.GamePoint
import core.animal.Animal

abstract class Terrain(
    override var position: GamePoint,
    open var animal: Animal? = null,
): SimulationObject() {
    abstract fun copy(value: Terrain): Terrain
}