package servicio;

import modelo.EstadoSolicitud;
import modelo.Producto;
import modelo.SolicitudCompra;

import java.util.ArrayList;
import java.util.List;

public class GestionSolicitud {
    private List<SolicitudCompra> solicitudes = new ArrayList<>();

    public void agregarSolicitud(SolicitudCompra s) {
        solicitudes.add(s);
    }

    public List<SolicitudCompra> listarSolicitudes() {
        return solicitudes;
    }

    public SolicitudCompra buscarPorNumero(int numero) {
        for (SolicitudCompra s : solicitudes) {
            if (s.getNumero() == numero) {
                return s;
            }
        }
        return null;
    }

    public boolean aprobarSolicitud(int numero) {
        SolicitudCompra s = buscarPorNumero(numero);
        if (s != null && s.getEstado() == EstadoSolicitud.SOLICITADA) {
            s.setEstado(EstadoSolicitud.APROBADA);
            return true;
        }
        return false;
    }

    public boolean rechazarSolicitud(int numero) {
        SolicitudCompra s = buscarPorNumero(numero);
        if (s != null && s.getEstado() == EstadoSolicitud.SOLICITADA) {
            s.setEstado(EstadoSolicitud.RECHAZADA);
            return true;
        }
        return false;
    }
}