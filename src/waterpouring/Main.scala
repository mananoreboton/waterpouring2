package waterpouring

import waterpouring.Main.problem

object Main extends App {
  private val problem = new Pouring(Vector(4,7))
  println (problem.moves)
  private val solution = problem.solution(6).toVector
  println(solution)
}
