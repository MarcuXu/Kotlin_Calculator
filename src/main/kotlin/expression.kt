/**
 * 定义计算公式实体类
 */
data class Expression(
    val left: String,
    val operator: Operation,
    val right: String
)
