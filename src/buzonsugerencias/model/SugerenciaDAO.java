package buzonsugerencias.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SugerenciaDAO {

    public boolean insertar(Sugerencia s) {
        String sql = "INSERT INTO sugerencias (nombre, categoria, es_anonimo, sugerencia) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getNombre());
            ps.setString(2, s.getCategoria());
            ps.setBoolean(3, s.isEsAnonimo());
            ps.setString(4, s.getSugerencia());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List<Sugerencia> obtenerTodas() {
        List<Sugerencia> lista = new ArrayList<>();
        String sql = "SELECT * FROM sugerencias ORDER BY fecha DESC";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Sugerencia s = new Sugerencia();
                s.setId(rs.getInt("id"));
                s.setNombre(rs.getString("nombre"));
                s.setCategoria(rs.getString("categoria"));
                s.setEsAnonimo(rs.getBoolean("es_anonimo"));
                s.setSugerencia(rs.getString("sugerencia"));
                s.setFecha(rs.getTimestamp("fecha"));
                lista.add(s);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM sugerencias WHERE id = ?";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
