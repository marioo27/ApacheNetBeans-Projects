/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garcia_mario_examenej2_ud3;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Usuario implements Serializable{
    
    private String user;
    private String passw;
    
	public Usuario(String user, String passw) {
		this.user = user;
		this.passw = passw;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

    @Override
    public String toString() {
        return "Nombre de Usuario: " + user + ", Contraseña" + passw + "\n";
    }
    
        
}
