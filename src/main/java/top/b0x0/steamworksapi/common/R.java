package top.b0x0.steamworksapi.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 响应实体
 *
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@Data
@NoArgsConstructor
public class R implements Serializable {
    private static final long serialVersionUID = -9171125403769257805L;

    private Integer status;
    private String msg;
    private Object data;

    public static R build(Integer status, String msg, Object data) {
        return new R(status, msg, data);
    }

    public static R build(Integer status) {
        return new R(status, null, null);
    }

    public static R ok(Object data) {
        return new R(data);
    }

    public static R ok() {
        return new R(null);
    }

    public static R fail(Integer status, String message) {
        return new R(status, message, null);
    }

    public static R fail(String failMsg) {
        return new R(400, failMsg, null);
    }

    public static R build(Integer status, String msg) {
        return new R(status, msg, null);
    }

    private R(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private R(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

}