import React from "react";
import Column from "../components/table/column/Column";
import TablePageHeader from "../components/table/TablePageHeader";
import AddColumnButton from "../components/table/column/AddColumnButton";
import ColumnWrapper from "../components/table/column/ColumnWrapper";
import TableBackground from "../components/table/TableBackground";
import TablePageBody from "../components/table/TablePageBody";

const TablePage = () => {
  const columns = [
    {
      id: 0,
      title: "Hello",
      cards: [
        { id: 1, users: [] },
        { id: 2, users: [] },
        { id: 3, users: [] },
        { id: 4, users: [] },
        { id: 5, users: [] },
        { id: 6, users: [] },
        { id: 7, users: [] },
        { id: 8, users: [] },
        { id: 9, users: [] },
        { id: 10, users: [] },
        { id: 11, users: [] },
        { id: 12, users: [] },
      ],
    },
  ];
  const bgImage = "https://i.imgur.com/IEEifKy.jpg";
  return (
    <TableBackground bgImage={bgImage}>
      <TablePageHeader />
      <TablePageBody>
        {columns.map((column) => (
          <ColumnWrapper key={column.id}>
            <Column column={column} />
          </ColumnWrapper>
        ))}
        <ColumnWrapper>
          <AddColumnButton />
        </ColumnWrapper>
      </TablePageBody>
    </TableBackground>
  );
};

export default TablePage;
