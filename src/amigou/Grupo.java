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

public class Grupo {
  private String nombre;
  private ArrayList<Usuario> usuarios;
  private ArrayList<String> intereses;

  public Grupo(String nombre, ArrayList<Usuario> usuarios, ArrayList<String> intereses) {
    this.nombre = nombre;
    this.usuarios = usuarios;
    this.intereses = intereses;
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Usuario> getUsuarios() {
    return usuarios;
  }

  public ArrayList<String> getIntereses() {
    return intereses;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setUsuarios(ArrayList<Usuario> usuarios) {
    this.usuarios = usuarios;
  }

  public void setIntereses(ArrayList<String> intereses) {
    this.intereses = intereses;
  }

  public void agregarUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }

  public void agregarInteres(String interes) {
    intereses.add(interes);
  }
}

