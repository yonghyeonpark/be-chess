package chess.pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class PawnTest {

    @Test
    @DisplayName("흰색 폰이 정상적으로 생성되어야 합니다.")
    void createPawnByWhiteColor() {
        String color = Pawn.WHITE_COLOR;
        assertThat(new Pawn(color).verifyPawn(color)).isTrue();
    }

    @Test
    @DisplayName("검은색 폰이 정상적으로 생성되어야 합니다.")
    void createPawnByBlackColor() {
        String color = Pawn.BLACK_COLOR;
        assertThat(new Pawn(color).verifyPawn(color)).isTrue();
    }

    @Test
    @DisplayName("색상이 흰색 혹은 검은색인 경우에만 폰 객체가 생성됩니다.")
    void createPawnByNonWhiteAndNonBlackColor() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Pawn("blue"));
    }

    @Test
    @DisplayName("기본 생성자로 Pawn 객체를 생성하면 색상은 흰색이어야 합니다.")
    public void createPawnBy기본생성자() {
        assertThat(new Pawn().verifyPawn(Pawn.WHITE_COLOR)).isTrue();
    }
}