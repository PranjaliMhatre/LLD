package model;

import strategy.gameWinningStrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;

    private Game(){

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static class Builder{
        private Board board;
        private List<Player> players;
        private List<Move> moves;
        private Player winner;
        private GameStatus gameStatus;
        private int nextPlayerIndex;
        private GameWinningStrategy gameWinningStrategy;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public Builder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public Builder setNextPlayerIndex(int nextPlayerIndex) {
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public Builder setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategy = gameWinningStrategy;
            return this;
        }

        public boolean valid(){
            // TODO: add validations and throw custom exceptions if not valid
            return true;
        }
        public Game build(){
            try{
                valid();
            }
            catch (Exception e){
                // TODO: handle the thrown exception
            }

            Game game = new Game();
            game.setBoard(new Board(3)); // TODO: take user input
            game.setPlayers(players);
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0); // TODO: keep the value random from 0 - dimension - 2
            game.setGameWinningStrategy(null); // TODO: add game winning strategy using factory

            return game;
        }
    }
}
