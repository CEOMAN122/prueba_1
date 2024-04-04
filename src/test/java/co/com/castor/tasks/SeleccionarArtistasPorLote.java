package co.com.castor.tasks;

import co.com.castor.userinterface.ArtistPanelPage;
import co.com.castor.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.castor.userinterface.ArtistPanelPage.BTN_CLOSE;
import static co.com.castor.userinterface.ArtistPanelPage.BTN_CONT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.Presence.of;

public class SeleccionarArtistasPorLote implements Task {

    private final int totalArtistasSeleccionar;

    public SeleccionarArtistasPorLote(int totalArtistasSeleccionar) {
        this.totalArtistasSeleccionar = totalArtistasSeleccionar;
    }

    public static SeleccionarArtistasPorLote conTotal(int totalArtistasSeleccionar) {
        return instrumented(SeleccionarArtistasPorLote.class, totalArtistasSeleccionar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int artistasSeleccionados = 0;
        int loteActual = 1;
        Target botonCategoria = ArtistPanelPage.BTN_CATEGORIA;

        while (artistasSeleccionados < totalArtistasSeleccionar) {
            // Seleccionar artistas en el lote actual
            for (int i = 0; i < Math.min(8, totalArtistasSeleccionar - artistasSeleccionados - (loteActual - 1) * 8); i++) {
                Target elementoArtista = ArtistPanelPage.getArtistElement(i);
                actor.attemptsTo(
                        Click.on(elementoArtista)
                );
                artistasSeleccionados++;
            }

            // Actualizar la lista de artistas
            if (loteActual < totalArtistasSeleccionar / 8) {
                // Esperar un tiempo después de seleccionar el lote actual
                Wait.theSeconds(8);

                // Hacer clic en el botón de categoría para actualizar la lista
                actor.attemptsTo(
                        Click.on(botonCategoria)
                );

                // Esperar a que el primer elemento del artista sea visible nuevamente
                actor.attemptsTo(
                        WaitUntil.the(ArtistPanelPage.getArtistElement(0), isVisible())
                                .forNoMoreThan(10).seconds()
                );
            }

            loteActual++;
            actor.attemptsTo(
                    Click.on(BTN_CONT),
                    Wait.theSeconds(5),
                    Click.on(BTN_CLOSE)

            );
        }
    }
}
