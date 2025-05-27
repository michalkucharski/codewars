package kata
​
import "fmt"
​
func Digits(n uint64) int {
  strAux := fmt.Sprintf("%v", n)
  return len(strAux)
}
​