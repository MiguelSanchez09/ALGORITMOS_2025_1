public class ValidadorContrasenas {

    // Constante para la longitud mínima
    private static final int LONGITUD_MINIMA = 8;

    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     * @param password La contraseña a verificar.
     * @return true si la longitud es válida, false en caso contrario.
     */
    public static boolean esLongitudValida(String password) {
        return password != null && password.length() >= LONGITUD_MINIMA;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una mayúscula, false en caso contrario.
     */
    public static boolean contieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una minúscula, false en caso contrario.
     */
    public static boolean contieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos un dígito.
     * @param password La contraseña a verificar.
     * @return true si contiene un dígito, false en caso contrario.
     */
    public static boolean contieneDigito(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si una contraseña es segura según todos los criterios.
     * @param password La contraseña a verificar.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String password) {
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }

    public static void main(String[] args) {
        String[] pruebas = {
            "clave123",       // No tiene mayúscula
            "ClaveSegura1",   // Válida
            "OTRAMAYUSCULA2", // No tiene minúscula
            "abcDEF",         // No tiene dígito y longitud < 8
            "Abcdefgh",       // No tiene dígito
            "12345678",       // No tiene letras
            "Abc12345"        // Válida
        };

        for (String prueba : pruebas) {
            System.out.println("'" + prueba + "' es segura? " + esContrasenaSegura(prueba));
        }
    }
}
