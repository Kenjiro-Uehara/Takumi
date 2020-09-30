package Test.Kenjiro.Uehara.Takumi;

/**
 * シンプルな匠メソッドオブジェクトの実装です。
 */
public class SimpleTakumiObject implements HasDisplayText {
    private final String text;

    public SimpleTakumiObject(String text) {
        this.text = text;
    }

    /**
     * 表示用文字列を返します。
     *
     * @return 表示用文字列
     */
    @Override
    public String displayText() {
        return text;
    }
}
