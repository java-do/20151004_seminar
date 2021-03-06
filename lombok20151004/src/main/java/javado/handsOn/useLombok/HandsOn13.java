package javado.handsOn.useLombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.val;
import lombok.experimental.Accessors;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;

/**
 * イミュータルオブジェクトに向けたwithメソッド（コード例）
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Accessors(chain = true)
@Wither
public class HandsOn13 {

  private String name;
  private String state;

  public static void main(String[] args) {
    val mutable1 = new HandsOn13();
    val mutable2 = mutable1.setName("JavaDo");
    val mutable3 = mutable2.setState("札幌");
    log.info("mutable1: " + mutable1.toString());
    log.info("mutable2: " + mutable2.toString());
    log.info("mutable3: " + mutable3.toString());

    val immutable1 = new HandsOn13();
    val immutable2 = immutable1.withName("JavaDo");
    val immutable3 = immutable2.withState("札幌");
    log.info("immutable1: " + immutable1.toString());
    log.info("immutable2: " + immutable2.toString());
    log.info("immutable3: " + immutable3.toString());
  }

}
