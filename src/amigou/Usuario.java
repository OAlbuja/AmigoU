/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String apellido;
    private String mail;
    private String genero;
    private String tipoUsuario;
    private int semestreCursado;
    private List<Integer> intereses;
    private double distancia;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String mail, String genero, String tipoUsuario, int semestreCursado, List<Integer> intereses) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.genero = genero;
        this.tipoUsuario = tipoUsuario;
        this.semestreCursado = semestreCursado;
        this.intereses = intereses;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getSemestreCursado() {
        return semestreCursado;
    }

    public void setSemestreCursado(int semestreCursado) {
        this.semestreCursado = semestreCursado;
    }

    public List<Integer> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<Integer> intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", genero=" + genero + ", tipoUsuario=" + tipoUsuario + ", semestreCursado=" + semestreCursado + ", intereses=" + intereses + '}';
    }

}
