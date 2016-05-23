<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

    <head>

        <meta charset="utf-8" />

        <title>Ablabla ffichage d'un client</title>

        <link type="text/css" rel="stylesheet" href="inc/style.css" />

    </head>

    <body>
	<c:out value="supertest " />
        <%-- Affichage de la chaîne "message" transmise par la servlet --%>

        <p class="info">${ message }</p>

        <%-- Puis affichage des données enregistrées dans le bean "client" transmis par la servlet --%>

        <p>TEST TRUC Nom : ${ client.nom }</p>

        <p>TRUC Prénom : ${ client.prenom }</p>

        <p>GIT HUB Adresse : ${ client.adresse }</p>

        <p>TEST TEST Numéro de téléphone : ${ client.telephone }</p>

        <p> bug FIX master master 3 Email : ${ client.email }</p>

    </body>

</html>