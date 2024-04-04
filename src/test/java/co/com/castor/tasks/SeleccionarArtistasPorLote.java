package co.com.castor.tasks;

import co.com.castor.userinterface.ArtistPanelPage;
import co.com.castor.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarArtistasPorLote implements Task {
    private final int totalArtistasSeleccionar;

    public SeleccionarArtistasPorLote(int totalArtistasSeleccionar) {
        this.totalArtistasSeleccionar = totalArtistasSeleccionar;
    }

    public static SeleccionarArtistasPorLote conTotal(int totalArtistasSeleccionar) {
        return (SeleccionarArtistasPorLote)Tasks.instrumented(SeleccionarArtistasPorLote.class, new Object[]{totalArtistasSeleccionar});
    }

    public <T extends Actor> void performAs(T actor) {
        int artistasSeleccionados = 0;
        int loteActual = 1;
        Target botonCategoria = ArtistPanelPage.BTN_CATEGORIA;

        while(artistasSeleccionados < this.totalArtistasSeleccionar) {
            for(int i = 0; i < Math.min(8, this.totalArtistasSeleccionar - artistasSeleccionados - (loteActual - 1) * 8); ++i) {
                Target elementoArtista = ArtistPanelPage.getArtistElement(i);
                actor.attemptsTo(new Performable[]{Click.on(elementoArtista)});
                ++artistasSeleccionados;
            }

            if (loteActual < this.totalArtistasSeleccionar / 8) {
                Wait.theSeconds(8);
                actor.attemptsTo(new Performable[]{Click.on(botonCategoria)});
                actor.attemptsTo(new Performable[]{WaitUntil.the(ArtistPanelPage.getArtistElement(0), WebElementStateMatchers.isVisible()).forNoMoreThan(10L).seconds()});
            }
            ++loteActual;
        }

    }
}
