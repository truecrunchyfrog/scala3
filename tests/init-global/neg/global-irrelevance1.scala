object A:
  var x = 6

object B:
  var y = A.x * 2 // error
// nopos-error: No warnings can be incurred under -Werror.