
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Tue Jan 02 15:19:32 CET 2007

package scala

/** Tuple11 is the canonical representation of a @see Product11 */
case class Tuple11[+T1, +T2, +T3, +T4, +T5, +T6, +T7, +T8, +T9, +T10, +T11](_1:T1, _2:T2, _3:T3, _4:T4, _5:T5, _6:T6, _7:T7, _8:T8, _9:T9, _10:T10, _11:T11)
  extends Product11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {

   override def toString() = {
     val sb = new compat.StringBuilder
     sb.append('{').append(_1).append(',').append(_2).append(',').append(_3).append(',').append(_4).append(',').append(_5).append(',').append(_6).append(',').append(_7).append(',').append(_8).append(',').append(_9).append(',').append(_10).append(',').append(_11).append('}')
     sb.toString
   }
}
