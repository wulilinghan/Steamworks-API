package top.b0x0.steamworksapi.common;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class MethodDto {
    private String interfaceName;
    private String methodName;
    private String version;
}
