class MyQueue(object):
    stack = []
    front = None

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.stack = []
        self.front = None

    def push(self, x):
        """
        Push element x to the back of queue.
        :type x: int
        :rtype: None
        """
        if len(self.stack) == 0:
            self.front = x
        self.stack.append(x)
        return None

    def pop(self):
        """
        Removes the element from in front of queue and returns that element.
        :rtype: int
        """
        tempStack = []
        while self.stack:
            tempStack.append(self.stack.pop())
        result = tempStack.pop()
        self.front = None if len(
            tempStack) == 0 else copy.deepcopy(tempStack[-1])
        while tempStack:
            self.stack.append(tempStack.pop())
        return result

    def peek(self):
        """
        Get the front element.
        :rtype: int
        """
        return self.front

    def empty(self):
        """
        Returns whether the queue is empty.
        :rtype: bool
        """
        return len(self.stack) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
