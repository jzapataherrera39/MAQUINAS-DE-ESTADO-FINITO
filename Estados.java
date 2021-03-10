public class Maquinasdeestadofinito {
    private var activeestado :Function;
   
      public function Maquinasdeestadofinito() {
      }
   
      public function setState(state :Function) :void {
          activeestado = state;
      }
   
      public function update() :void {
          if (activeestado != null) {
              activeestado();
          }
      }
  }