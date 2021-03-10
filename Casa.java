public function Casa() :void {
   velocity = new Vector3D(Game.instance.home.x - position.x, Game.instance.home.y - position.y);
    if (distance(Game.instance.home, this) <= 12) {
        brain.setState(Busqueda);
    }
}
