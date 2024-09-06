Giải thích tại sao khi a dùng 1:
for (int i = 0; i <= index; i++) 
{ temp = temp.next; } 
thì temp nó là node tại vị trí index

còn nếu anh dùng ntn 2: 
for (int i = 0; i < index; i++)
 { temp = temp.next; } 
 thì temp nó là node trước vị trí index

1 -> 2 -> 3 -> 4 -> 5

Good luck cac em !!! --- ---

1 -> 2 -> 3 -> 4 -> 5 -> 6
1. cho index=3
   lúc này temp = head =1
   i = 0 -> temp = 2
   i = 1 -> temp = 3
   i = 2 -> temp = 4
   i = 3 -> temp = 5
   i = 4 -> dừng vòng lặp
2. Cho index = 3
   temp = head = 1
   i = 0 -> temp = 2
   i = 1 -> temp = 3
   i = 2 -> temp = 4
   i = 3 -> dừng vòng lặp