import React from 'react';
import { List, Datagrid, EmailField, TextField, BooleanField, EditButton, DisabledInput, SimpleForm, Edit } from 'react-admin';

export const UserList = (props) => (
    <List {...props}>
      <Datagrid>
        <TextField source="userId" />
        <EmailField source="username" />
        <TextField source="firstName" />
        <TextField source="lastName" />
        <BooleanField source="enabled" />
        <EditButton basePath="/user" />
      </Datagrid>
    </List>
);

const UserTitle = ({ record }) => {
  return <span>User {record ? `"${record.username}"` : ''}</span>;
};

export const UserEdit = (props) => (
    <Edit title={<UserTitle />} {...props}>
      <SimpleForm>
        <DisabledInput source="id" />
        <DisabledInput source="username" />
        <DisabledInput label="First Name" source="firstName" />
        <DisabledInput label="Last Name" source="lastName" />
        <BooleanField source="enabled" />
      </SimpleForm>
    </Edit>
);