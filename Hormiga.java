public class Hormiga
{
    public var position   :Vector3D;
    public var velocity   :Vector3D;
    public var brain      :Maquinasdeestadofinito;
 
    public function Hormiga(posX :Number, posY :Number) {
        position    = new Vector3D(posX, posY);
        velocity    = new Vector3D( -1, -1);
        brain       = new Maquinasdeestadofinito();
 
        brain.setState(Busqueda);
    }
 
    public function Busqueda() :void {
    }
    public function Casa() :void {
    }
 
    public function Escapa() :void {
    }
 
    public function update():void {

        moveBasedOnVelocity();
    }
 
}