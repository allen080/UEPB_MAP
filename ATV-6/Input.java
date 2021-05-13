public class Input {
	private String teclado,joystick;

    public Input(){
        this.teclado = null;
        this.joystick = null;
    }

    public void configurarTeclado(String teclado){
        this.teclado = teclado;
    }

    public void configurarJoystick(String joystick){
        this.joystick = joystick;
    }

    public boolean lerInput(String teclado,String joystick){
        configurarTeclado(teclado);
        configurarJoystick(joystick);
        return true;
    }
}