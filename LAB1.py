def calculation(p, q, r, s):
    if p + q + r + s > 4:
        print("输入错误，非0格式化为1")
    if p == 0 & q == 0:
        temp1 = 0
    else:
        temp1 = 1
    temp1 = temp1 ^ 1
    if p != 0 | r != 0:
        temp2 = 1
    else:
        temp2 = 0
    if temp1 == 1 & temp2 == 1:
        return "True"
    else:
        return "Flase"
    pass


if __name__ == '__main__':
    print("P\t Q\t R\t S\t ┃ 结果")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━")
    for p in range(2):
        for q in range(2):
            for r in range(2):
                for s in range(2):
                    print(p, '\t', q, '\t', r,'\t', s, '\t', '┃',calculation(p, q, r, s))

    print("\n请输入p,q,r,s的值")
    p = int(input("p="))
    q = int(input("q="))
    r = int(input("r="))
    s = int(input("s="))
    print("结果为：" + calculation(p, q, r, s))
