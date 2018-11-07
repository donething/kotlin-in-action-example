package chap4

import javax.naming.Context
import javax.swing.text.AttributeSet


/**
 * Created by Donething on 2018/10/28
 */

fun main(args: Array<String>) {

}

// 主构造方法
open class User(nickname: String)

class TwitterUser(nickname: String) : User(nickname)

// 从构造方法
open class View {
    constructor(ctx: Context) {
        // some code
    }
    constructor(ctx: Context, attr: AttributeSet) {
        // some code
    }
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx) {    // 调用父类构造方法
        // some code
    }
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {  // 调用父类构造方法
        // some code
    }
}