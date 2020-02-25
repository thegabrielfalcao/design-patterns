package br.com.thegabrielfalcao.designpatterns.state.refactoringguru.states.impl;

import br.com.thegabrielfalcao.designpatterns.state.refactoringguru.states.State;
import br.com.thegabrielfalcao.designpatterns.state.refactoringguru.ui.Player;

public class PlayingState extends State {

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
