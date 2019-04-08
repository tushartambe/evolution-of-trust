package com.game;

class Machine {
    Result generateResult(Move firstPlayerMove, Move secondPlayerMove) {

        if (isMoveCoOperate(firstPlayerMove) && isMoveCheat(secondPlayerMove)) {
            return new Result(-1, 3);
        }

        if (isMoveCoOperate(firstPlayerMove) && isMoveCoOperate(secondPlayerMove)) {
            return new Result(2, 2);
        }

        if (isMoveCheat(firstPlayerMove) && isMoveCoOperate(secondPlayerMove)) {
            return new Result(3, -1);
        }
        return new Result(0, 0);
    }

    private boolean isMoveCoOperate(Move move) {
        return move == Move.CO_OPERATE;
    }

    private boolean isMoveCheat(Move move) {
        return move == Move.CHEAT;
    }
}
