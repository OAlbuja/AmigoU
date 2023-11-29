/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

//import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ox_ar
 */

public class AmigoU {
    private List<Usuario> listaUsuarios;

    public AmigoU(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void imprimirTodosUsuarios() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }
    
        public void mostrarPorAreaInteres() {

    }
}

