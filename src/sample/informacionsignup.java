dpackage sample;

public class informacionsignup {
        String nombre;
        String apellido;
        String email;
        String contraseña;
        String confirmar;


              public informacionsignup(String nombre, String apellido, String email,
                       String contraseña, String confirmar) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.contraseña = contraseña;
            this.confirmar = confirmar;
        }

        public String getEmail() {
            return email;
        }

        public String getApellido() {
            return apellido;
        }
c
        public String getName() {
            return nombre;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setConfirmar(String confirmar) {
        this.confirmar= confirmar;
        }

    }
}

