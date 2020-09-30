package Test.Kenjiro.Uehara.Takumi;

import java.util.List;

/**
 * 価値デザインモデルを表すクラスです。
 */
public class ValueDesignModel {
    private final TakumiObjectHolder takumiObjectHolder;

    public ValueDesignModel(TakumiObjectHolder takumiObjectHolder) {
        this.takumiObjectHolder = takumiObjectHolder;
    }

    /**
     * ビジョンを返します。
     * @return ビジョン
     */
    public TakumiObject getVision() {
        return takumiObjectHolder.getVision();
    }

    /**
     * コンセプトを返します。
     * @return コンセプト
     */
    public List<TakumiObject> getConcepts() {
        return takumiObjectHolder.getConepts();
    }

    /**
     * 言葉を返します。
     * @return 言葉
     */
    public TakumiObject getCatchphrase() {
        return takumiObjectHolder.getCatchphrase();
    }
}
