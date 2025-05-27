package kata
​
import (
   "strings"
   "fmt"
)
func Capitalize(st string, arr []int) string {
  //..
  sArr := strings.Split(st, "")
  
  fmt.Println(arr)
  for _, v := range arr {
    if v < len(st) {
      sArr[v] = strings.ToUpper(sArr[v])
      fmt.Println(sArr[v])
    }
  }
  fmt.Println(sArr)
  return strings.Join(sArr, "")
  
}