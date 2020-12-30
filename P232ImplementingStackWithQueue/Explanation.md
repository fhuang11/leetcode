# Implementing Stack with Queue

# Solution 1 Stack last to first item
Solution 1 is to add last item to beginning of stack. The peek and pop operations have O(1) time just by popping or peeking at the last item on the stack. However, push operation is O(n) because all items in stack must be popped off stack and pushed onto new stack, new item added to bottom of stack and items popped off new stack onto new stack. 

# Solution 2 Stack first to last item
Solution 2 is to add last item to end of stack. The push operation will be O(1) just by pushing last item onto stack. The pop operation will involve popping items off stack onto new stack, getting the first item, and popping and pushing items back onto original stack. The pop operation will be O(N). However, the peek operation can be O(N) if the push and pop operations keep track of the the first item in the stack. For push, the first item will be updated if the stack is empty. The pop, the first item in the stack must be updated with the next element after getting the first element.