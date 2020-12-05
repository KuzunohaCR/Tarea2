/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.dao;

import cr.ac.ucenfotec.proyectofinal.bl.entidades.Compositor;
import cr.ac.ucenfotec.proyectofinal.bl.entidades.NoAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NoAdminDAO {

    Connection cnx;

    public NoAdminDAO() throws InstantiationException, IllegalAccessException, SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys",
                    "root", "rootroot");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void save(NoAdmin noAdmin) throws SQLException {
        Statement stmt = cnx.createStatement();
        StringBuilder buildSentence = new StringBuilder("insert into noadmin (nombre,apellido,idpais,edad,identificacion,correo,nombreusuario,contrasenna)");
        buildSentence.append(" values ('");
        buildSentence.append(noAdmin.getNombre());
        buildSentence.append("','");
        buildSentence.append(noAdmin.getApellido());
        buildSentence.append("',");
        buildSentence.append(noAdmin.getPaises().getIdPais());
        buildSentence.append(",");
        buildSentence.append(noAdmin.getEdad());
        buildSentence.append(",");
        buildSentence.append(noAdmin.getIdentificacion());
        buildSentence.append(",'");
        buildSentence.append(noAdmin.getCorreo());
        buildSentence.append("','");
        buildSentence.append(noAdmin.getNombreUsuario());
        buildSentence.append("','");
        buildSentence.append(noAdmin.getContrasenna());
        buildSentence.append("')");
        System.out.println(buildSentence.toString());
        stmt.execute(buildSentence.toString());
    }

    public List<NoAdmin> findAll() throws SQLException, InstantiationException, IllegalAccessException {
        ArrayList<NoAdmin> listOfResults = new ArrayList<>();
        Statement stmt = cnx.createStatement();
        ResultSet result = stmt.executeQuery("select * from noadmin");
        while (result.next()) {
            NoAdmin noAdmin = new NoAdmin();
            PaisDAO pais = new PaisDAO();

            noAdmin.setNombre(result.getString("nombre"));
            noAdmin.setApellido(result.getString("apellido"));

            noAdmin.setPaises(pais.findByPaisID(result.getInt("idpais")));
            noAdmin.setEdad(result.getInt("edad"));
            noAdmin.setIdentificacion(result.getInt("identificacion"));
            noAdmin.setCorreo(result.getString("correo"));
            noAdmin.setNombreUsuario(result.getString("nombreUsuario"));
            noAdmin.setContrasenna(result.getString("contrasenna"));

            listOfResults.add(noAdmin);
        }
        return listOfResults;
    }

    public NoAdmin findByNoAdminID(int idNoAdmin) throws SQLException, InstantiationException, IllegalAccessException {

        Statement stmt = cnx.createStatement();

        StringBuilder buildSentence = new StringBuilder("select * from noadmin");
        buildSentence.append(" where ('idnoadmin=");
        buildSentence.append(idNoAdmin);
        buildSentence.append("')");

        ResultSet result = stmt.executeQuery(buildSentence.toString());

        while (result.next()) {
            NoAdmin noAdmin = new NoAdmin();
            PaisDAO pais = new PaisDAO();

            noAdmin.setNombre(result.getString("nombre"));
            noAdmin.setApellido(result.getString("apellido"));

            noAdmin.setPaises(pais.findByPaisID(result.getInt("idpais")));
            noAdmin.setEdad(result.getInt("edad"));
            noAdmin.setIdentificacion(result.getInt("identificacion"));
            noAdmin.setCorreo(result.getString("correo"));
            noAdmin.setNombreUsuario(result.getString("nombreUsuario"));
            noAdmin.setContrasenna(result.getString("contrasenna"));
            return noAdmin;
        }
        return null;
    }
}
