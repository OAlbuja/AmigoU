/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

/**
 *
 * @author ox_ar
 */
import java.util.ArrayList;

public class Chat {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Mensaje> mensajes;

    public Chat() {
        usuarios = new ArrayList<>();
        mensajes = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(Usuario remitente, Usuario destinatario, String contenido) {
        Mensaje mensaje = new Mensaje(remitente, destinatario, contenido);
        mensajes.add(mensaje);
    }

    public ArrayList<Mensaje> obtenerMensajesEntre(Usuario usuario1, Usuario usuario2) {
        ArrayList<Mensaje> mensajesEntre = new ArrayList<>();
        for (Mensaje mensaje : mensajes) {
            if ((mensaje.getRemitente().equals(usuario1) && mensaje.getDestinatario().equals(usuario2)) ||
                (mensaje.getRemitente().equals(usuario2) && mensaje.getDestinatario().equals(usuario1))) {
                mensajesEntre.add(mensaje);
            }
        }
        return mensajesEntre;
    }

    private class Mensaje {
        private Usuario remitente;
        private Usuario destinatario;
        private String contenido;

        public Mensaje(Usuario remitente, Usuario destinatario, String contenido) {
            this.remitente = remitente;
            this.destinatario = destinatario;
            this.contenido = contenido;
        }

        public Usuario getRemitente() {
            return remitente;
        }

        public Usuario getDestinatario() {
            return destinatario;
        }

        public String getContenido() {
            return contenido;
        }
    }
}
