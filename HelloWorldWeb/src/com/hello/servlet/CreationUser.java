package com.hello.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello.beans.Client;
import com.hello.beans.User;

public class CreationUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7211099350685653359L;
	private int counter = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 
		 * R�cup�ration des donn�es saisies, envoy�es en tant que param�tres de
		 * 
		 * la requ�te GET g�n�r�e � la validation du formulaire
		 * 
		 */

		String nom = req.getParameter("nomClient");

		String prenom = req.getParameter("prenomClient");

		String adresse = req.getParameter("adresseClient");

		String telephone = req.getParameter("telephoneClient");

		String email = req.getParameter("emailClient");

		String message;

		/*
		 * 
		 * Initialisation du message � afficher : si un des champs obligatoires
		 * 
		 * du formulaire n'est pas renseign�, alors on affiche un message
		 * 
		 * d'erreur, sinon on affiche un message de succ�s
		 * 
		 */

		if (nom.trim().isEmpty() || adresse.trim().isEmpty() || telephone.trim().isEmpty()) {

			message = "Erreur - Vous n'avez pas rempli tous les champs obligatoires. <br> <a href=\"createUser.jsp\">Cliquez ici</a> pour acc�der au formulaire de cr�ation d'un client.";

		} else {

			message = "Client cr�� avec succ�s !";

		}

		/*
		 * 
		 * Cr�ation du bean Client et initialisation avec les donn�es r�cup�r�es
		 * 
		 */

		Client client = new Client();

		client.setNom(nom);

		client.setPrenom(prenom);

		client.setAdresse(adresse);

		client.setTelephone(telephone);

		client.setEmail(email);

		/* Ajout du bean et du message � l'objet requ�te */

		req.setAttribute("client", client);

		req.setAttribute("message", message);

		/* Transmission � la page JSP en charge de l'affichage des donn�es */

		this.getServletContext().getRequestDispatcher("/afficherUser.jsp").forward(req, resp);
	}

}
