class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        cols = len(grid[0])
        rows = len(grid)
        output = 0
        
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == "1":
                    output += 1

                    queue = deque()
                    queue.append((row, col))
                    grid[row][col] = "0"

                    while queue:
                        drow, dcol = queue.popleft()

                        for add_row, add_col in [(1,0), (-1,0), (0,1), (0,-1)]:
                            new_row, new_col = drow + add_row, dcol + add_col

                            if (0 <= new_row < rows and 0 <= new_col < cols and grid[new_row][new_col] == "1"):
                                grid[new_row][new_col] = "0"
                                queue.append((new_row, new_col))
        
        print(grid)
        return output

        