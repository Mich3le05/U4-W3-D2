import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EventoDAO eventoDAO = new EventoDAO();

        // Creare e salvare un nuovo evento
        Evento evento = new Evento("Concerto Jazz", LocalDate.of(2025, 5, 20), "Concerto di musica jazz", TipoEvento.PUBBLICO, 200);
        eventoDAO.save(evento);

        // Recuperare l'evento per ID
        Evento recuperato = eventoDAO.getById(evento.getId());
        System.out.println("Evento recuperato: " + recuperato.getTitolo());

        // Eliminare l'evento
        eventoDAO.delete(evento.getId());
        System.out.println("Evento eliminato!");
    }
}
