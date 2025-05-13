​
package kata
import "fmt"
​
  
 
​
type MyString string
​
func (s MyString) IsUpperCase() bool {
  // Your code here!
  isUpper := true
  for _, r := range s {
    fmt.Println("elem", r)
    if r > 90 {
      isUpper = false
    }
  }
  
  return isUpper
  
}