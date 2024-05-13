// Copyright (c) 2024 Gitpod GmbH. All rights reserved.
// Licensed under the GNU Affero General Public License (AGPL).
// See License.AGPL.txt in the project root for license information.

// Code generated by protoc-proxy-gen. DO NOT EDIT.

package v1connect

import (
	context "context"
	connect_go "github.com/bufbuild/connect-go"
	v1 "github.com/gitpod-io/gitpod/components/public-api/go/v1"
)

var _ WorkspaceServiceHandler = (*ProxyWorkspaceServiceHandler)(nil)

type ProxyWorkspaceServiceHandler struct {
	Client v1.WorkspaceServiceClient
	UnimplementedWorkspaceServiceHandler
}

func (s *ProxyWorkspaceServiceHandler) GetWorkspace(ctx context.Context, req *connect_go.Request[v1.GetWorkspaceRequest]) (*connect_go.Response[v1.GetWorkspaceResponse], error) {
	resp, err := s.Client.GetWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) ListWorkspaces(ctx context.Context, req *connect_go.Request[v1.ListWorkspacesRequest]) (*connect_go.Response[v1.ListWorkspacesResponse], error) {
	resp, err := s.Client.ListWorkspaces(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) ListWorkspaceSessions(ctx context.Context, req *connect_go.Request[v1.ListWorkspaceSessionsRequest]) (*connect_go.Response[v1.ListWorkspaceSessionsResponse], error) {
	resp, err := s.Client.ListWorkspaceSessions(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) CreateAndStartWorkspace(ctx context.Context, req *connect_go.Request[v1.CreateAndStartWorkspaceRequest]) (*connect_go.Response[v1.CreateAndStartWorkspaceResponse], error) {
	resp, err := s.Client.CreateAndStartWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) StartWorkspace(ctx context.Context, req *connect_go.Request[v1.StartWorkspaceRequest]) (*connect_go.Response[v1.StartWorkspaceResponse], error) {
	resp, err := s.Client.StartWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) UpdateWorkspace(ctx context.Context, req *connect_go.Request[v1.UpdateWorkspaceRequest]) (*connect_go.Response[v1.UpdateWorkspaceResponse], error) {
	resp, err := s.Client.UpdateWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) StopWorkspace(ctx context.Context, req *connect_go.Request[v1.StopWorkspaceRequest]) (*connect_go.Response[v1.StopWorkspaceResponse], error) {
	resp, err := s.Client.StopWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) DeleteWorkspace(ctx context.Context, req *connect_go.Request[v1.DeleteWorkspaceRequest]) (*connect_go.Response[v1.DeleteWorkspaceResponse], error) {
	resp, err := s.Client.DeleteWorkspace(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) ListWorkspaceClasses(ctx context.Context, req *connect_go.Request[v1.ListWorkspaceClassesRequest]) (*connect_go.Response[v1.ListWorkspaceClassesResponse], error) {
	resp, err := s.Client.ListWorkspaceClasses(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) ParseContextURL(ctx context.Context, req *connect_go.Request[v1.ParseContextURLRequest]) (*connect_go.Response[v1.ParseContextURLResponse], error) {
	resp, err := s.Client.ParseContextURL(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) GetWorkspaceDefaultImage(ctx context.Context, req *connect_go.Request[v1.GetWorkspaceDefaultImageRequest]) (*connect_go.Response[v1.GetWorkspaceDefaultImageResponse], error) {
	resp, err := s.Client.GetWorkspaceDefaultImage(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) SendHeartBeat(ctx context.Context, req *connect_go.Request[v1.SendHeartBeatRequest]) (*connect_go.Response[v1.SendHeartBeatResponse], error) {
	resp, err := s.Client.SendHeartBeat(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) GetWorkspaceOwnerToken(ctx context.Context, req *connect_go.Request[v1.GetWorkspaceOwnerTokenRequest]) (*connect_go.Response[v1.GetWorkspaceOwnerTokenResponse], error) {
	resp, err := s.Client.GetWorkspaceOwnerToken(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) GetWorkspaceEditorCredentials(ctx context.Context, req *connect_go.Request[v1.GetWorkspaceEditorCredentialsRequest]) (*connect_go.Response[v1.GetWorkspaceEditorCredentialsResponse], error) {
	resp, err := s.Client.GetWorkspaceEditorCredentials(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) CreateWorkspaceSnapshot(ctx context.Context, req *connect_go.Request[v1.CreateWorkspaceSnapshotRequest]) (*connect_go.Response[v1.CreateWorkspaceSnapshotResponse], error) {
	resp, err := s.Client.CreateWorkspaceSnapshot(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) WaitForWorkspaceSnapshot(ctx context.Context, req *connect_go.Request[v1.WaitForWorkspaceSnapshotRequest]) (*connect_go.Response[v1.WaitForWorkspaceSnapshotResponse], error) {
	resp, err := s.Client.WaitForWorkspaceSnapshot(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}

func (s *ProxyWorkspaceServiceHandler) UpdateWorkspacePort(ctx context.Context, req *connect_go.Request[v1.UpdateWorkspacePortRequest]) (*connect_go.Response[v1.UpdateWorkspacePortResponse], error) {
	resp, err := s.Client.UpdateWorkspacePort(ctx, req.Msg)
	if err != nil {
		// TODO(milan): Convert to correct status code
		return nil, err
	}

	return connect_go.NewResponse(resp), nil
}
